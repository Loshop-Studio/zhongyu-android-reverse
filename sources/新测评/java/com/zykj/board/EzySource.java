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
    public static final Descriptors.Descriptor f8420a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8421b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f8422c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f8423d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f8424e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f8425f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f8426g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f8427h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f8428i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f8429j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f8430k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f8431l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f8432m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f8433n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f8434o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f8435p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f8436q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f8437r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f8438s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f8439t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f8440u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f8441v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f8442w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f8443x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f8444y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fSource.proto\u001a\u0016utils/TouchEvent.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0018enums/GeometryEnum.proto\"}\n\u000bTouchSource\u0012)\n\ttouchInfo\u0018\u0001 \u0003(\u000b2\u0016.TouchSource.TouchInfo\u001aC\n\tTouchInfo\u0012\u001f\n\ntouchEvent\u0018\u0001 \u0003(\u000b2\u000b.TouchEvent\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"c\n\fMatrixSource\u0012,\n\nmatrixInfo\u0018\u0001 \u0003(\u000b2\u0018.MatrixSource.MatrixInfo\u001a%\n\nMatrixInfo\u0012\u0017\n\u0006matrix\u0018\u0001 \u0003(\u000b2\u0007.Matrix\"\u007f\n\nFileSource\u0012&\n\bfileInfo\u0018\u0001 \u0003(\u000b2\u0014.FileSource.FileInfo\u001aI\n\bFileInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bvalidate\u0018\u0004 \u0001(\t\"w\n\u000bAudioSource\u0012)\n\taudioInfo\u0018\u0001 \u0003(\u000b2\u0016.AudioSource.AudioInfo\u001a=\n\tAudioInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\"h\n\nTextSource\u0012&\n\btextInfo\u0018\u0001 \u0003(\u000b2\u0014.TextSource.TextInfo\u001a2\n\bTextInfo\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"©\u0001\n\u000eGeometrySource\u00122\n\fgeometryInfo\u0018\u0001 \u0003(\u000b2\u001c.GeometrySource.GeometryInfo\u001ac\n\fGeometryInfo\u0012#\n\fgeometryType\u0018\u0001 \u0001(\u000e2\r.GeometryEnum\u0012\u0017\n\u0006points\u0018\u0002 \u0003(\u000b2\u0007.PointF\u0012\u0015\n\u0005paint\u0018\u0003 \u0001(\u000b2\u0006.PaintB\u001b\n\u000ecom.zykj.boardB\tEzySourceb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyTouchEvent.m8535g(), EzyMatrix.m7709c(), EzyPaint.m7960c(), EzyPointF.m8002c(), EzyGeometryEnum.m7483a()});

    public static final class FileSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final FileSource f8445c = new FileSource();

        /* renamed from: d */
        public static final Parser f8446d = new C6821a();

        /* renamed from: a */
        public List f8447a;

        /* renamed from: b */
        public byte f8448b;

        public static final class FileInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final FileInfo f8449f = new FileInfo();

            /* renamed from: g */
            public static final Parser f8450g = new C6819a();

            /* renamed from: a */
            public volatile Object f8451a;

            /* renamed from: b */
            public int f8452b;

            /* renamed from: c */
            public int f8453c;

            /* renamed from: d */
            public volatile Object f8454d;

            /* renamed from: e */
            public byte f8455e;

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$a */
            public class C6819a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FileInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6820b c6820bM8217t = FileInfo.m8217t();
                    try {
                        c6820bM8217t.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6820bM8217t.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6820bM8217t.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6820bM8217t.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6820bM8217t.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f8430k;
            }

            public static Parser parser() {
                return f8450g;
            }

            /* renamed from: q */
            public static FileInfo m8216q() {
                return f8449f;
            }

            /* renamed from: t */
            public static C6820b m8217t() {
                return f8449f.toBuilder();
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
                return getName().equals(fileInfo.getName()) && getWidth() == fileInfo.getWidth() && getHeight() == fileInfo.getHeight() && m8219s().equals(fileInfo.m8219s()) && getUnknownFields().equals(fileInfo.getUnknownFields());
            }

            public int getHeight() {
                return this.f8453c;
            }

            public String getName() {
                Object obj = this.f8451a;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8451a = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8450g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8451a) ? GeneratedMessageV3.computeStringSize(1, this.f8451a) : 0;
                int i11 = this.f8452b;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(2, i11);
                }
                int i12 = this.f8453c;
                if (i12 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(3, i12);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8454d)) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f8454d);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getWidth() {
                return this.f8452b;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + m8219s().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8431l.ensureFieldAccessorsInitialized(FileInfo.class, C6820b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8455e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8455e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new FileInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public FileInfo getDefaultInstanceForType() {
                return f8449f;
            }

            /* renamed from: s */
            public String m8219s() {
                Object obj = this.f8454d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8454d = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6820b newBuilderForType() {
                return m8217t();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C6820b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6820b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C6820b toBuilder() {
                return this == f8449f ? new C6820b() : new C6820b().m8235n(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f8451a)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8451a);
                }
                int i10 = this.f8452b;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                int i11 = this.f8453c;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(3, i11);
                }
                if (!GeneratedMessageV3.isStringEmpty(this.f8454d)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.f8454d);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$b */
            public static final class C6820b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8456a;

                /* renamed from: b */
                public Object f8457b;

                /* renamed from: c */
                public int f8458c;

                /* renamed from: d */
                public int f8459d;

                /* renamed from: e */
                public Object f8460e;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6820b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6820b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public FileInfo build() {
                    FileInfo fileInfoBuildPartial = buildPartial();
                    if (fileInfoBuildPartial.isInitialized()) {
                        return fileInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public FileInfo buildPartial() {
                    FileInfo fileInfo = new FileInfo(this);
                    if (this.f8456a != 0) {
                        m8227e(fileInfo);
                    }
                    onBuilt();
                    return fileInfo;
                }

                /* renamed from: e */
                public final void m8227e(FileInfo fileInfo) {
                    int i10 = this.f8456a;
                    if ((i10 & 1) != 0) {
                        fileInfo.f8451a = this.f8457b;
                    }
                    if ((i10 & 2) != 0) {
                        fileInfo.f8452b = this.f8458c;
                    }
                    if ((i10 & 4) != 0) {
                        fileInfo.f8453c = this.f8459d;
                    }
                    if ((i10 & 8) != 0) {
                        fileInfo.f8454d = this.f8460e;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C6820b clear() {
                    super.clear();
                    this.f8456a = 0;
                    this.f8457b = "";
                    this.f8458c = 0;
                    this.f8459d = 0;
                    this.f8460e = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C6820b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6820b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f8430k;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6820b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6820b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6820b mo24228clone() {
                    return (C6820b) super.mo24228clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f8431l.ensureFieldAccessorsInitialized(FileInfo.class, C6820b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public FileInfo getDefaultInstanceForType() {
                    return FileInfo.m8216q();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6820b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f8457b = codedInputStream.readStringRequireUtf8();
                                        this.f8456a |= 1;
                                    } else if (tag == 16) {
                                        this.f8458c = codedInputStream.readInt32();
                                        this.f8456a |= 2;
                                    } else if (tag == 24) {
                                        this.f8459d = codedInputStream.readInt32();
                                        this.f8456a |= 4;
                                    } else if (tag == 34) {
                                        this.f8460e = codedInputStream.readStringRequireUtf8();
                                        this.f8456a |= 8;
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
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C6820b mergeFrom(Message message) {
                    if (message instanceof FileInfo) {
                        return m8235n((FileInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C6820b m8235n(FileInfo fileInfo) {
                    if (fileInfo == FileInfo.m8216q()) {
                        return this;
                    }
                    if (!fileInfo.getName().isEmpty()) {
                        this.f8457b = fileInfo.f8451a;
                        this.f8456a |= 1;
                        onChanged();
                    }
                    if (fileInfo.getWidth() != 0) {
                        m8243w(fileInfo.getWidth());
                    }
                    if (fileInfo.getHeight() != 0) {
                        m8238r(fileInfo.getHeight());
                    }
                    if (!fileInfo.m8219s().isEmpty()) {
                        this.f8460e = fileInfo.f8454d;
                        this.f8456a |= 8;
                        onChanged();
                    }
                    mergeUnknownFields(fileInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C6820b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6820b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C6820b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6820b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: r */
                public C6820b m8238r(int i10) {
                    this.f8459d = i10;
                    this.f8456a |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C6820b m8239s(String str) {
                    str.getClass();
                    this.f8457b = str;
                    this.f8456a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C6820b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6820b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C6820b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6820b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: v */
                public C6820b m8242v(String str) {
                    str.getClass();
                    this.f8460e = str;
                    this.f8456a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: w */
                public C6820b m8243w(int i10) {
                    this.f8458c = i10;
                    this.f8456a |= 2;
                    onChanged();
                    return this;
                }

                public C6820b() {
                    this.f8457b = "";
                    this.f8460e = "";
                }

                public C6820b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8457b = "";
                    this.f8460e = "";
                }
            }

            public FileInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8451a = "";
                this.f8452b = 0;
                this.f8453c = 0;
                this.f8454d = "";
                this.f8455e = (byte) -1;
            }

            private FileInfo() {
                this.f8451a = "";
                this.f8452b = 0;
                this.f8453c = 0;
                this.f8454d = "";
                this.f8455e = (byte) -1;
                this.f8451a = "";
                this.f8454d = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$a */
        public class C6821a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FileSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6822b c6822bM8202r = FileSource.m8202r();
                try {
                    c6822bM8202r.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6822bM8202r.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6822bM8202r.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6822bM8202r.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6822bM8202r.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f8428i;
        }

        /* renamed from: k */
        public static FileSource m8201k() {
            return f8445c;
        }

        /* renamed from: r */
        public static C6822b m8202r() {
            return f8445c.toBuilder();
        }

        /* renamed from: u */
        public static FileSource m8203u(InputStream inputStream) {
            return (FileSource) GeneratedMessageV3.parseWithIOException(f8446d, inputStream);
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
            return m8206q().equals(fileSource.m8206q()) && getUnknownFields().equals(fileSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8446d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8447a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8447a.get(i11));
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
            if (m8205o() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8206q().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f8429j.ensureFieldAccessorsInitialized(FileSource.class, C6822b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8448b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8448b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public FileSource getDefaultInstanceForType() {
            return f8445c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FileSource();
        }

        /* renamed from: o */
        public int m8205o() {
            return this.f8447a.size();
        }

        /* renamed from: q */
        public List m8206q() {
            return this.f8447a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6822b newBuilderForType() {
            return m8202r();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C6822b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6822b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C6822b toBuilder() {
            return this == f8445c ? new C6822b() : new C6822b().m8259r(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f8447a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8447a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$b */
        public static final class C6822b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8461a;

            /* renamed from: b */
            public List f8462b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8463c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6822b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6822b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public FileSource build() {
                FileSource fileSourceBuildPartial = buildPartial();
                if (fileSourceBuildPartial.isInitialized()) {
                    return fileSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public FileSource buildPartial() {
                FileSource fileSource = new FileSource(this);
                m8249f(fileSource);
                if (this.f8461a != 0) {
                    m8248e(fileSource);
                }
                onBuilt();
                return fileSource;
            }

            /* renamed from: e */
            public final void m8248e(FileSource fileSource) {
            }

            /* renamed from: f */
            public final void m8249f(FileSource fileSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8463c;
                if (repeatedFieldBuilderV3 != null) {
                    fileSource.f8447a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8461a & 1) != 0) {
                    this.f8462b = Collections.unmodifiableList(this.f8462b);
                    this.f8461a &= -2;
                }
                fileSource.f8447a = this.f8462b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6822b clear() {
                super.clear();
                this.f8461a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8463c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8462b = Collections.EMPTY_LIST;
                } else {
                    this.f8462b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8461a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f8428i;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6822b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6822b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6822b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6822b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8429j.ensureFieldAccessorsInitialized(FileSource.class, C6822b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6822b mo24228clone() {
                return (C6822b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m8254l() {
                if ((this.f8461a & 1) == 0) {
                    this.f8462b = new ArrayList(this.f8462b);
                    this.f8461a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public FileSource getDefaultInstanceForType() {
                return FileSource.m8201k();
            }

            /* renamed from: n */
            public final RepeatedFieldBuilderV3 m8256n() {
                if (this.f8463c == null) {
                    this.f8463c = new RepeatedFieldBuilderV3(this.f8462b, (this.f8461a & 1) != 0, getParentForChildren(), isClean());
                    this.f8462b = null;
                }
                return this.f8463c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C6822b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    FileInfo fileInfo = (FileInfo) codedInputStream.readMessage(FileInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8463c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8254l();
                                        this.f8462b.add(fileInfo);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6822b mergeFrom(Message message) {
                if (message instanceof FileSource) {
                    return m8259r((FileSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C6822b m8259r(FileSource fileSource) {
                if (fileSource == FileSource.m8201k()) {
                    return this;
                }
                if (this.f8463c == null) {
                    if (!fileSource.f8447a.isEmpty()) {
                        if (this.f8462b.isEmpty()) {
                            this.f8462b = fileSource.f8447a;
                            this.f8461a &= -2;
                        } else {
                            m8254l();
                            this.f8462b.addAll(fileSource.f8447a);
                        }
                        onChanged();
                    }
                } else if (!fileSource.f8447a.isEmpty()) {
                    if (this.f8463c.isEmpty()) {
                        this.f8463c.dispose();
                        this.f8463c = null;
                        this.f8462b = fileSource.f8447a;
                        this.f8461a &= -2;
                        this.f8463c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8256n() : null;
                    } else {
                        this.f8463c.addAllMessages(fileSource.f8447a);
                    }
                }
                mergeUnknownFields(fileSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6822b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6822b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6822b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6822b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6822b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6822b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C6822b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6822b) super.setUnknownFields(unknownFieldSet);
            }

            public C6822b() {
                this.f8462b = Collections.EMPTY_LIST;
            }

            public C6822b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8462b = Collections.EMPTY_LIST;
            }
        }

        public FileSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8448b = (byte) -1;
        }

        private FileSource() {
            this.f8448b = (byte) -1;
            this.f8447a = Collections.EMPTY_LIST;
        }
    }

    public static final class GeometrySource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final GeometrySource f8464c = new GeometrySource();

        /* renamed from: d */
        public static final Parser f8465d = new C6825a();

        /* renamed from: a */
        public List f8466a;

        /* renamed from: b */
        public byte f8467b;

        public static final class GeometryInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: f */
            public static final GeometryInfo f8468f = new GeometryInfo();

            /* renamed from: g */
            public static final Parser f8469g = new C6823a();

            /* renamed from: a */
            public int f8470a;

            /* renamed from: b */
            public int f8471b;

            /* renamed from: c */
            public List f8472c;

            /* renamed from: d */
            public EzyPaint.Paint f8473d;

            /* renamed from: e */
            public byte f8474e;

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$a */
            public class C6823a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GeometryInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6824b c6824bM8284w = GeometryInfo.m8284w();
                    try {
                        c6824bM8284w.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6824bM8284w.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6824bM8284w.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6824bM8284w.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6824bM8284w.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f8442w;
            }

            public static Parser parser() {
                return f8469g;
            }

            /* renamed from: q */
            public static /* synthetic */ int m8281q(GeometryInfo geometryInfo, int i10) {
                int i11 = i10 | geometryInfo.f8470a;
                geometryInfo.f8470a = i11;
                return i11;
            }

            /* renamed from: s */
            public static GeometryInfo m8283s() {
                return f8468f;
            }

            /* renamed from: w */
            public static C6824b m8284w() {
                return f8468f.toBuilder();
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
                if (this.f8471b == geometryInfo.f8471b && getPointsList().equals(geometryInfo.getPointsList()) && hasPaint() == geometryInfo.hasPaint()) {
                    return (!hasPaint() || m8287v().equals(geometryInfo.m8287v())) && getUnknownFields().equals(geometryInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8469g;
            }

            public int getPointsCount() {
                return this.f8472c.size();
            }

            public List getPointsList() {
                return this.f8472c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = this.f8471b != EzyGeometryEnum.GeometryEnum.OVAL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f8471b) : 0;
                for (int i11 = 0; i11 < this.f8472c.size(); i11++) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f8472c.get(i11));
                }
                if ((this.f8470a & 1) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m8287v());
                }
                int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasPaint() {
                return (this.f8470a & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f8471b;
                if (getPointsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPointsList().hashCode();
                }
                if (hasPaint()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m8287v().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8443x.ensureFieldAccessorsInitialized(GeometryInfo.class, C6824b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8474e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8474e = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GeometryInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public GeometryInfo getDefaultInstanceForType() {
                return f8468f;
            }

            /* renamed from: u */
            public int m8286u() {
                return this.f8471b;
            }

            /* renamed from: v */
            public EzyPaint.Paint m8287v() {
                EzyPaint.Paint paint = this.f8473d;
                return paint == null ? EzyPaint.Paint.m7967q() : paint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.f8471b != EzyGeometryEnum.GeometryEnum.OVAL.getNumber()) {
                    codedOutputStream.writeEnum(1, this.f8471b);
                }
                for (int i10 = 0; i10 < this.f8472c.size(); i10++) {
                    codedOutputStream.writeMessage(2, (MessageLite) this.f8472c.get(i10));
                }
                if ((this.f8470a & 1) != 0) {
                    codedOutputStream.writeMessage(3, m8287v());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public C6824b newBuilderForType() {
                return m8284w();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C6824b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6824b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C6824b toBuilder() {
                return this == f8468f ? new C6824b() : new C6824b().m8308t(this);
            }

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$b */
            public static final class C6824b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8475a;

                /* renamed from: b */
                public int f8476b;

                /* renamed from: c */
                public List f8477c;

                /* renamed from: d */
                public RepeatedFieldBuilderV3 f8478d;

                /* renamed from: e */
                public EzyPaint.Paint f8479e;

                /* renamed from: f */
                public SingleFieldBuilderV3 f8480f;

                private void ensurePointsIsMutable() {
                    if ((this.f8475a & 2) == 0) {
                        this.f8477c = new ArrayList(this.f8477c);
                        this.f8475a |= 2;
                    }
                }

                private RepeatedFieldBuilderV3 getPointsFieldBuilder() {
                    if (this.f8478d == null) {
                        this.f8478d = new RepeatedFieldBuilderV3(this.f8477c, (this.f8475a & 2) != 0, getParentForChildren(), isClean());
                        this.f8477c = null;
                    }
                    return this.f8478d;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getPointsFieldBuilder();
                        m8292q();
                    }
                }

                /* renamed from: q */
                private SingleFieldBuilderV3 m8292q() {
                    if (this.f8480f == null) {
                        this.f8480f = new SingleFieldBuilderV3(m8304n(), getParentForChildren(), isClean());
                        this.f8479e = null;
                    }
                    return this.f8480f;
                }

                /* renamed from: b */
                public C6824b m8293b(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8478d;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    ensurePointsIsMutable();
                    this.f8477c.add(pointF);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C6824b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6824b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public GeometryInfo build() {
                    GeometryInfo geometryInfoBuildPartial = buildPartial();
                    if (geometryInfoBuildPartial.isInitialized()) {
                        return geometryInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometryInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public GeometryInfo buildPartial() {
                    GeometryInfo geometryInfo = new GeometryInfo(this);
                    m8298g(geometryInfo);
                    if (this.f8475a != 0) {
                        m8297f(geometryInfo);
                    }
                    onBuilt();
                    return geometryInfo;
                }

                /* renamed from: f */
                public final void m8297f(GeometryInfo geometryInfo) {
                    int i10;
                    int i11 = this.f8475a;
                    if ((i11 & 1) != 0) {
                        geometryInfo.f8471b = this.f8476b;
                    }
                    if ((i11 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8480f;
                        geometryInfo.f8473d = singleFieldBuilderV3 == null ? this.f8479e : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    GeometryInfo.m8281q(geometryInfo, i10);
                }

                /* renamed from: g */
                public final void m8298g(GeometryInfo geometryInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8478d;
                    if (repeatedFieldBuilderV3 != null) {
                        geometryInfo.f8472c = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f8475a & 2) != 0) {
                        this.f8477c = Collections.unmodifiableList(this.f8477c);
                        this.f8475a &= -3;
                    }
                    geometryInfo.f8472c = this.f8477c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f8442w;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6824b clear() {
                    super.clear();
                    this.f8475a = 0;
                    this.f8476b = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8478d;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f8477c = Collections.EMPTY_LIST;
                    } else {
                        this.f8477c = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f8475a &= -3;
                    this.f8479e = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8480f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f8480f = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6824b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6824b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f8443x.ensureFieldAccessorsInitialized(GeometryInfo.class, C6824b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C6824b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6824b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6824b mo24228clone() {
                    return (C6824b) super.mo24228clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public GeometryInfo getDefaultInstanceForType() {
                    return GeometryInfo.m8283s();
                }

                /* renamed from: n */
                public EzyPaint.Paint m8304n() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8480f;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f8479e;
                    return paint == null ? EzyPaint.Paint.m7967q() : paint;
                }

                /* renamed from: p */
                public EzyPaint.Paint.C6804b m8305p() {
                    this.f8475a |= 4;
                    onChanged();
                    return (EzyPaint.Paint.C6804b) m8292q().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C6824b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f8476b = codedInputStream.readEnum();
                                        this.f8475a |= 1;
                                    } else if (tag == 18) {
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8478d;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensurePointsIsMutable();
                                            this.f8477c.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(pointF);
                                        }
                                    } else if (tag == 26) {
                                        codedInputStream.readMessage(m8292q().getBuilder(), extensionRegistryLite);
                                        this.f8475a |= 4;
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
                public C6824b mergeFrom(Message message) {
                    if (message instanceof GeometryInfo) {
                        return m8308t((GeometryInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: t */
                public C6824b m8308t(GeometryInfo geometryInfo) {
                    if (geometryInfo == GeometryInfo.m8283s()) {
                        return this;
                    }
                    if (geometryInfo.f8471b != 0) {
                        m8312x(geometryInfo.m8286u());
                    }
                    if (this.f8478d == null) {
                        if (!geometryInfo.f8472c.isEmpty()) {
                            if (this.f8477c.isEmpty()) {
                                this.f8477c = geometryInfo.f8472c;
                                this.f8475a &= -3;
                            } else {
                                ensurePointsIsMutable();
                                this.f8477c.addAll(geometryInfo.f8472c);
                            }
                            onChanged();
                        }
                    } else if (!geometryInfo.f8472c.isEmpty()) {
                        if (this.f8478d.isEmpty()) {
                            this.f8478d.dispose();
                            this.f8478d = null;
                            this.f8477c = geometryInfo.f8472c;
                            this.f8475a &= -3;
                            this.f8478d = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                        } else {
                            this.f8478d.addAllMessages(geometryInfo.f8472c);
                        }
                    }
                    if (geometryInfo.hasPaint()) {
                        m8309u(geometryInfo.m8287v());
                    }
                    mergeUnknownFields(geometryInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C6824b m8309u(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8480f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f8475a & 4) == 0 || (paint2 = this.f8479e) == null || paint2 == EzyPaint.Paint.m7967q()) {
                        this.f8479e = paint;
                    } else {
                        m8305p().m7989n(paint);
                    }
                    if (this.f8479e != null) {
                        this.f8475a |= 4;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public final C6824b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6824b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C6824b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6824b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: x */
                public C6824b m8312x(int i10) {
                    this.f8476b = i10;
                    this.f8475a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C6824b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6824b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public final C6824b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6824b) super.setUnknownFields(unknownFieldSet);
                }

                public C6824b() {
                    this.f8476b = 0;
                    this.f8477c = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C6824b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8476b = 0;
                    this.f8477c = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public GeometryInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8471b = 0;
                this.f8474e = (byte) -1;
            }

            private GeometryInfo() {
                this.f8474e = (byte) -1;
                this.f8471b = 0;
                this.f8472c = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$a */
        public class C6825a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public GeometrySource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6826b c6826bM8267q = GeometrySource.m8267q();
                try {
                    c6826bM8267q.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6826bM8267q.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6826bM8267q.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6826bM8267q.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6826bM8267q.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f8440u;
        }

        /* renamed from: j */
        public static GeometrySource m8266j() {
            return f8464c;
        }

        /* renamed from: q */
        public static C6826b m8267q() {
            return f8464c.toBuilder();
        }

        /* renamed from: t */
        public static GeometrySource m8268t(InputStream inputStream) {
            return (GeometrySource) GeneratedMessageV3.parseWithIOException(f8465d, inputStream);
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
            return m8271o().equals(geometrySource.m8271o()) && getUnknownFields().equals(geometrySource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8465d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8466a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8466a.get(i11));
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
            if (m8270m() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8271o().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f8441v.ensureFieldAccessorsInitialized(GeometrySource.class, C6826b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8467b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8467b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public GeometrySource getDefaultInstanceForType() {
            return f8464c;
        }

        /* renamed from: m */
        public int m8270m() {
            return this.f8466a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GeometrySource();
        }

        /* renamed from: o */
        public List m8271o() {
            return this.f8466a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C6826b newBuilderForType() {
            return m8267q();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6826b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6826b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C6826b toBuilder() {
            return this == f8464c ? new C6826b() : new C6826b().m8330r(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f8466a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8466a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$b */
        public static final class C6826b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8481a;

            /* renamed from: b */
            public List f8482b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8483c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6826b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6826b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public GeometrySource build() {
                GeometrySource geometrySourceBuildPartial = buildPartial();
                if (geometrySourceBuildPartial.isInitialized()) {
                    return geometrySourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometrySourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public GeometrySource buildPartial() {
                GeometrySource geometrySource = new GeometrySource(this);
                m8320f(geometrySource);
                if (this.f8481a != 0) {
                    m8319e(geometrySource);
                }
                onBuilt();
                return geometrySource;
            }

            /* renamed from: e */
            public final void m8319e(GeometrySource geometrySource) {
            }

            /* renamed from: f */
            public final void m8320f(GeometrySource geometrySource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8483c;
                if (repeatedFieldBuilderV3 != null) {
                    geometrySource.f8466a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8481a & 1) != 0) {
                    this.f8482b = Collections.unmodifiableList(this.f8482b);
                    this.f8481a &= -2;
                }
                geometrySource.f8466a = this.f8482b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6826b clear() {
                super.clear();
                this.f8481a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8483c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8482b = Collections.EMPTY_LIST;
                } else {
                    this.f8482b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8481a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f8440u;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6826b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6826b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6826b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6826b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8441v.ensureFieldAccessorsInitialized(GeometrySource.class, C6826b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6826b mo24228clone() {
                return (C6826b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m8325l() {
                if ((this.f8481a & 1) == 0) {
                    this.f8482b = new ArrayList(this.f8482b);
                    this.f8481a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public GeometrySource getDefaultInstanceForType() {
                return GeometrySource.m8266j();
            }

            /* renamed from: n */
            public final RepeatedFieldBuilderV3 m8327n() {
                if (this.f8483c == null) {
                    this.f8483c = new RepeatedFieldBuilderV3(this.f8482b, (this.f8481a & 1) != 0, getParentForChildren(), isClean());
                    this.f8482b = null;
                }
                return this.f8483c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C6826b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    GeometryInfo geometryInfo = (GeometryInfo) codedInputStream.readMessage(GeometryInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8483c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8325l();
                                        this.f8482b.add(geometryInfo);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6826b mergeFrom(Message message) {
                if (message instanceof GeometrySource) {
                    return m8330r((GeometrySource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C6826b m8330r(GeometrySource geometrySource) {
                if (geometrySource == GeometrySource.m8266j()) {
                    return this;
                }
                if (this.f8483c == null) {
                    if (!geometrySource.f8466a.isEmpty()) {
                        if (this.f8482b.isEmpty()) {
                            this.f8482b = geometrySource.f8466a;
                            this.f8481a &= -2;
                        } else {
                            m8325l();
                            this.f8482b.addAll(geometrySource.f8466a);
                        }
                        onChanged();
                    }
                } else if (!geometrySource.f8466a.isEmpty()) {
                    if (this.f8483c.isEmpty()) {
                        this.f8483c.dispose();
                        this.f8483c = null;
                        this.f8482b = geometrySource.f8466a;
                        this.f8481a &= -2;
                        this.f8483c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8327n() : null;
                    } else {
                        this.f8483c.addAllMessages(geometrySource.f8466a);
                    }
                }
                mergeUnknownFields(geometrySource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6826b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6826b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6826b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6826b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6826b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6826b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C6826b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6826b) super.setUnknownFields(unknownFieldSet);
            }

            public C6826b() {
                this.f8482b = Collections.EMPTY_LIST;
            }

            public C6826b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8482b = Collections.EMPTY_LIST;
            }
        }

        public GeometrySource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8467b = (byte) -1;
        }

        private GeometrySource() {
            this.f8467b = (byte) -1;
            this.f8466a = Collections.EMPTY_LIST;
        }
    }

    public static final class MatrixSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final MatrixSource f8484c = new MatrixSource();

        /* renamed from: d */
        public static final Parser f8485d = new C6829a();

        /* renamed from: a */
        public List f8486a;

        /* renamed from: b */
        public byte f8487b;

        public static final class MatrixInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: c */
            public static final MatrixInfo f8488c = new MatrixInfo();

            /* renamed from: d */
            public static final Parser f8489d = new C6827a();

            /* renamed from: a */
            public List f8490a;

            /* renamed from: b */
            public byte f8491b;

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$a */
            public class C6827a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public MatrixInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6828b c6828bM8350o = MatrixInfo.m8350o();
                    try {
                        c6828bM8350o.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6828bM8350o.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6828bM8350o.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6828bM8350o.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6828bM8350o.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f8426g;
            }

            /* renamed from: k */
            public static MatrixInfo m8349k() {
                return f8488c;
            }

            /* renamed from: o */
            public static C6828b m8350o() {
                return f8488c.toBuilder();
            }

            public static Parser parser() {
                return f8489d;
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
                return this.f8490a.size();
            }

            public List getMatrixList() {
                return this.f8490a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8489d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = 0;
                for (int i11 = 0; i11 < this.f8490a.size(); i11++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8490a.get(i11));
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
                if (getMatrixCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getMatrixList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8427h.ensureFieldAccessorsInitialized(MatrixInfo.class, C6828b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8491b;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8491b = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public MatrixInfo getDefaultInstanceForType() {
                return f8488c;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new MatrixInfo();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6828b newBuilderForType() {
                return m8350o();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C6828b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6828b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C6828b toBuilder() {
                return this == f8488c ? new C6828b() : new C6828b().m8370r(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i10 = 0; i10 < this.f8490a.size(); i10++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f8490a.get(i10));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$b */
            public static final class C6828b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8492a;

                /* renamed from: b */
                public List f8493b;

                /* renamed from: c */
                public RepeatedFieldBuilderV3 f8494c;

                /* renamed from: b */
                public C6828b m8356b(EzyMatrix.Matrix.C6790b c6790b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8494c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c6790b.build());
                        return this;
                    }
                    ensureMatrixIsMutable();
                    this.f8493b.add(c6790b.build());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C6828b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6828b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public MatrixInfo build() {
                    MatrixInfo matrixInfoBuildPartial = buildPartial();
                    if (matrixInfoBuildPartial.isInitialized()) {
                        return matrixInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public MatrixInfo buildPartial() {
                    MatrixInfo matrixInfo = new MatrixInfo(this);
                    m8361g(matrixInfo);
                    if (this.f8492a != 0) {
                        m8360f(matrixInfo);
                    }
                    onBuilt();
                    return matrixInfo;
                }

                public final void ensureMatrixIsMutable() {
                    if ((this.f8492a & 1) == 0) {
                        this.f8493b = new ArrayList(this.f8493b);
                        this.f8492a |= 1;
                    }
                }

                /* renamed from: f */
                public final void m8360f(MatrixInfo matrixInfo) {
                }

                /* renamed from: g */
                public final void m8361g(MatrixInfo matrixInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8494c;
                    if (repeatedFieldBuilderV3 != null) {
                        matrixInfo.f8490a = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f8492a & 1) != 0) {
                        this.f8493b = Collections.unmodifiableList(this.f8493b);
                        this.f8492a &= -2;
                    }
                    matrixInfo.f8490a = this.f8493b;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f8426g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6828b clear() {
                    super.clear();
                    this.f8492a = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8494c;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f8493b = Collections.EMPTY_LIST;
                    } else {
                        this.f8493b = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f8492a &= -2;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6828b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6828b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f8427h.ensureFieldAccessorsInitialized(MatrixInfo.class, C6828b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C6828b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6828b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6828b mo24228clone() {
                    return (C6828b) super.mo24228clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public MatrixInfo getDefaultInstanceForType() {
                    return MatrixInfo.m8349k();
                }

                /* renamed from: n */
                public final RepeatedFieldBuilderV3 m8367n() {
                    if (this.f8494c == null) {
                        this.f8494c = new RepeatedFieldBuilderV3(this.f8493b, (this.f8492a & 1) != 0, getParentForChildren(), isClean());
                        this.f8493b = null;
                    }
                    return this.f8494c;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C6828b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyMatrix.Matrix matrix = (EzyMatrix.Matrix) codedInputStream.readMessage(EzyMatrix.Matrix.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8494c;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureMatrixIsMutable();
                                            this.f8493b.add(matrix);
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
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C6828b mergeFrom(Message message) {
                    if (message instanceof MatrixInfo) {
                        return m8370r((MatrixInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: r */
                public C6828b m8370r(MatrixInfo matrixInfo) {
                    if (matrixInfo == MatrixInfo.m8349k()) {
                        return this;
                    }
                    if (this.f8494c == null) {
                        if (!matrixInfo.f8490a.isEmpty()) {
                            if (this.f8493b.isEmpty()) {
                                this.f8493b = matrixInfo.f8490a;
                                this.f8492a &= -2;
                            } else {
                                ensureMatrixIsMutable();
                                this.f8493b.addAll(matrixInfo.f8490a);
                            }
                            onChanged();
                        }
                    } else if (!matrixInfo.f8490a.isEmpty()) {
                        if (this.f8494c.isEmpty()) {
                            this.f8494c.dispose();
                            this.f8494c = null;
                            this.f8493b = matrixInfo.f8490a;
                            this.f8492a &= -2;
                            this.f8494c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8367n() : null;
                        } else {
                            this.f8494c.addAllMessages(matrixInfo.f8490a);
                        }
                    }
                    mergeUnknownFields(matrixInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C6828b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6828b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C6828b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6828b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C6828b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6828b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public final C6828b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6828b) super.setUnknownFields(unknownFieldSet);
                }

                public C6828b() {
                    this.f8493b = Collections.EMPTY_LIST;
                }

                public C6828b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8493b = Collections.EMPTY_LIST;
                }
            }

            public MatrixInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8491b = (byte) -1;
            }

            private MatrixInfo() {
                this.f8491b = (byte) -1;
                this.f8490a = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$a */
        public class C6829a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MatrixSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6830b c6830bM8338q = MatrixSource.m8338q();
                try {
                    c6830bM8338q.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6830bM8338q.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6830bM8338q.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6830bM8338q.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6830bM8338q.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f8424e;
        }

        /* renamed from: j */
        public static MatrixSource m8337j() {
            return f8484c;
        }

        /* renamed from: q */
        public static C6830b m8338q() {
            return f8484c.toBuilder();
        }

        /* renamed from: t */
        public static MatrixSource m8339t(InputStream inputStream) {
            return (MatrixSource) GeneratedMessageV3.parseWithIOException(f8485d, inputStream);
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
            return m8342o().equals(matrixSource.m8342o()) && getUnknownFields().equals(matrixSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8485d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8486a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8486a.get(i11));
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
            if (m8341m() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8342o().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f8425f.ensureFieldAccessorsInitialized(MatrixSource.class, C6830b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8487b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8487b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public MatrixSource getDefaultInstanceForType() {
            return f8484c;
        }

        /* renamed from: m */
        public int m8341m() {
            return this.f8486a.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MatrixSource();
        }

        /* renamed from: o */
        public List m8342o() {
            return this.f8486a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C6830b newBuilderForType() {
            return m8338q();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6830b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6830b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C6830b toBuilder() {
            return this == f8484c ? new C6830b() : new C6830b().m8390r(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f8486a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8486a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$b */
        public static final class C6830b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8495a;

            /* renamed from: b */
            public List f8496b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8497c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6830b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6830b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public MatrixSource build() {
                MatrixSource matrixSourceBuildPartial = buildPartial();
                if (matrixSourceBuildPartial.isInitialized()) {
                    return matrixSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public MatrixSource buildPartial() {
                MatrixSource matrixSource = new MatrixSource(this);
                m8380f(matrixSource);
                if (this.f8495a != 0) {
                    m8379e(matrixSource);
                }
                onBuilt();
                return matrixSource;
            }

            /* renamed from: e */
            public final void m8379e(MatrixSource matrixSource) {
            }

            /* renamed from: f */
            public final void m8380f(MatrixSource matrixSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8497c;
                if (repeatedFieldBuilderV3 != null) {
                    matrixSource.f8486a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8495a & 1) != 0) {
                    this.f8496b = Collections.unmodifiableList(this.f8496b);
                    this.f8495a &= -2;
                }
                matrixSource.f8486a = this.f8496b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6830b clear() {
                super.clear();
                this.f8495a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8497c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8496b = Collections.EMPTY_LIST;
                } else {
                    this.f8496b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8495a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f8424e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6830b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6830b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6830b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6830b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8425f.ensureFieldAccessorsInitialized(MatrixSource.class, C6830b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6830b mo24228clone() {
                return (C6830b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m8385l() {
                if ((this.f8495a & 1) == 0) {
                    this.f8496b = new ArrayList(this.f8496b);
                    this.f8495a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public MatrixSource getDefaultInstanceForType() {
                return MatrixSource.m8337j();
            }

            /* renamed from: n */
            public final RepeatedFieldBuilderV3 m8387n() {
                if (this.f8497c == null) {
                    this.f8497c = new RepeatedFieldBuilderV3(this.f8496b, (this.f8495a & 1) != 0, getParentForChildren(), isClean());
                    this.f8496b = null;
                }
                return this.f8497c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C6830b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    MatrixInfo matrixInfo = (MatrixInfo) codedInputStream.readMessage(MatrixInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8497c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8385l();
                                        this.f8496b.add(matrixInfo);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6830b mergeFrom(Message message) {
                if (message instanceof MatrixSource) {
                    return m8390r((MatrixSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C6830b m8390r(MatrixSource matrixSource) {
                if (matrixSource == MatrixSource.m8337j()) {
                    return this;
                }
                if (this.f8497c == null) {
                    if (!matrixSource.f8486a.isEmpty()) {
                        if (this.f8496b.isEmpty()) {
                            this.f8496b = matrixSource.f8486a;
                            this.f8495a &= -2;
                        } else {
                            m8385l();
                            this.f8496b.addAll(matrixSource.f8486a);
                        }
                        onChanged();
                    }
                } else if (!matrixSource.f8486a.isEmpty()) {
                    if (this.f8497c.isEmpty()) {
                        this.f8497c.dispose();
                        this.f8497c = null;
                        this.f8496b = matrixSource.f8486a;
                        this.f8495a &= -2;
                        this.f8497c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8387n() : null;
                    } else {
                        this.f8497c.addAllMessages(matrixSource.f8486a);
                    }
                }
                mergeUnknownFields(matrixSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6830b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6830b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6830b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6830b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6830b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6830b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C6830b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6830b) super.setUnknownFields(unknownFieldSet);
            }

            public C6830b() {
                this.f8496b = Collections.EMPTY_LIST;
            }

            public C6830b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8496b = Collections.EMPTY_LIST;
            }
        }

        public MatrixSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8487b = (byte) -1;
        }

        private MatrixSource() {
            this.f8487b = (byte) -1;
            this.f8486a = Collections.EMPTY_LIST;
        }
    }

    public static final class TextSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final TextSource f8498c = new TextSource();

        /* renamed from: d */
        public static final Parser f8499d = new C6833a();

        /* renamed from: a */
        public List f8500a;

        /* renamed from: b */
        public byte f8501b;

        public static final class TextInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: e */
            public static final TextInfo f8502e = new TextInfo();

            /* renamed from: f */
            public static final Parser f8503f = new C6831a();

            /* renamed from: a */
            public int f8504a;

            /* renamed from: b */
            public volatile Object f8505b;

            /* renamed from: c */
            public EzyPaint.Paint f8506c;

            /* renamed from: d */
            public byte f8507d;

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$a */
            public class C6831a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TextInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6832b c6832bM8413s = TextInfo.m8413s();
                    try {
                        c6832bM8413s.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6832bM8413s.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6832bM8413s.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6832bM8413s.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6832bM8413s.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f8438s;
            }

            /* renamed from: m */
            public static /* synthetic */ int m8411m(TextInfo textInfo, int i10) {
                int i11 = i10 | textInfo.f8504a;
                textInfo.f8504a = i11;
                return i11;
            }

            /* renamed from: o */
            public static TextInfo m8412o() {
                return f8502e;
            }

            public static Parser parser() {
                return f8503f;
            }

            /* renamed from: s */
            public static C6832b m8413s() {
                return f8502e.toBuilder();
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
                if (getContent().equals(textInfo.getContent()) && hasPaint() == textInfo.hasPaint()) {
                    return (!hasPaint() || m8415r().equals(textInfo.m8415r())) && getUnknownFields().equals(textInfo.getUnknownFields());
                }
                return false;
            }

            public String getContent() {
                Object obj = this.f8505b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f8505b = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8503f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8505b) ? GeneratedMessageV3.computeStringSize(1, this.f8505b) : 0;
                if ((1 & this.f8504a) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(2, m8415r());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean hasPaint() {
                return (this.f8504a & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode();
                if (hasPaint()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m8415r().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8439t.ensureFieldAccessorsInitialized(TextInfo.class, C6832b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8507d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8507d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TextInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public TextInfo getDefaultInstanceForType() {
                return f8502e;
            }

            /* renamed from: r */
            public EzyPaint.Paint m8415r() {
                EzyPaint.Paint paint = this.f8506c;
                return paint == null ? EzyPaint.Paint.m7967q() : paint;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6832b newBuilderForType() {
                return m8413s();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6832b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6832b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C6832b toBuilder() {
                return this == f8502e ? new C6832b() : new C6832b().m8434r(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!GeneratedMessageV3.isStringEmpty(this.f8505b)) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8505b);
                }
                if ((this.f8504a & 1) != 0) {
                    codedOutputStream.writeMessage(2, m8415r());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$b */
            public static final class C6832b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8508a;

                /* renamed from: b */
                public Object f8509b;

                /* renamed from: c */
                public EzyPaint.Paint f8510c;

                /* renamed from: d */
                public SingleFieldBuilderV3 f8511d;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        m8420n();
                    }
                }

                /* renamed from: n */
                private SingleFieldBuilderV3 m8420n() {
                    if (this.f8511d == null) {
                        this.f8511d = new SingleFieldBuilderV3(m8430l(), getParentForChildren(), isClean());
                        this.f8510c = null;
                    }
                    return this.f8511d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6832b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6832b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public TextInfo build() {
                    TextInfo textInfoBuildPartial = buildPartial();
                    if (textInfoBuildPartial.isInitialized()) {
                        return textInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) textInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public TextInfo buildPartial() {
                    TextInfo textInfo = new TextInfo(this);
                    if (this.f8508a != 0) {
                        m8424e(textInfo);
                    }
                    onBuilt();
                    return textInfo;
                }

                /* renamed from: e */
                public final void m8424e(TextInfo textInfo) {
                    int i10;
                    int i11 = this.f8508a;
                    if ((i11 & 1) != 0) {
                        textInfo.f8505b = this.f8509b;
                    }
                    if ((i11 & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8511d;
                        textInfo.f8506c = singleFieldBuilderV3 == null ? this.f8510c : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    TextInfo.m8411m(textInfo, i10);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C6832b clear() {
                    super.clear();
                    this.f8508a = 0;
                    this.f8509b = "";
                    this.f8510c = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8511d;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f8511d = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C6832b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6832b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f8438s;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6832b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6832b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6832b mo24228clone() {
                    return (C6832b) super.mo24228clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f8439t.ensureFieldAccessorsInitialized(TextInfo.class, C6832b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public TextInfo getDefaultInstanceForType() {
                    return TextInfo.m8412o();
                }

                /* renamed from: l */
                public EzyPaint.Paint m8430l() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8511d;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f8510c;
                    return paint == null ? EzyPaint.Paint.m7967q() : paint;
                }

                /* renamed from: m */
                public EzyPaint.Paint.C6804b m8431m() {
                    this.f8508a |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C6804b) m8420n().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C6832b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f8509b = codedInputStream.readStringRequireUtf8();
                                        this.f8508a |= 1;
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m8420n().getBuilder(), extensionRegistryLite);
                                        this.f8508a |= 2;
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
                public C6832b mergeFrom(Message message) {
                    if (message instanceof TextInfo) {
                        return m8434r((TextInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: r */
                public C6832b m8434r(TextInfo textInfo) {
                    if (textInfo == TextInfo.m8412o()) {
                        return this;
                    }
                    if (!textInfo.getContent().isEmpty()) {
                        this.f8509b = textInfo.f8505b;
                        this.f8508a |= 1;
                        onChanged();
                    }
                    if (textInfo.hasPaint()) {
                        m8435s(textInfo.m8415r());
                    }
                    mergeUnknownFields(textInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C6832b m8435s(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8511d;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f8508a & 2) == 0 || (paint2 = this.f8510c) == null || paint2 == EzyPaint.Paint.m7967q()) {
                        this.f8510c = paint;
                    } else {
                        m8431m().m7989n(paint);
                    }
                    if (this.f8510c != null) {
                        this.f8508a |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C6832b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6832b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: u */
                public C6832b m8437u(String str) {
                    str.getClass();
                    this.f8509b = str;
                    this.f8508a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C6832b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6832b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C6832b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6832b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public final C6832b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6832b) super.setUnknownFields(unknownFieldSet);
                }

                public C6832b() {
                    this.f8509b = "";
                    maybeForceBuilderInitialization();
                }

                public C6832b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8509b = "";
                    maybeForceBuilderInitialization();
                }
            }

            public TextInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8505b = "";
                this.f8507d = (byte) -1;
            }

            private TextInfo() {
                this.f8505b = "";
                this.f8507d = (byte) -1;
                this.f8505b = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$a */
        public class C6833a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TextSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6834b c6834bM8399r = TextSource.m8399r();
                try {
                    c6834bM8399r.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6834bM8399r.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6834bM8399r.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6834bM8399r.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6834bM8399r.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f8436q;
        }

        /* renamed from: k */
        public static TextSource m8398k() {
            return f8498c;
        }

        /* renamed from: r */
        public static C6834b m8399r() {
            return f8498c.toBuilder();
        }

        /* renamed from: u */
        public static TextSource m8400u(InputStream inputStream) {
            return (TextSource) GeneratedMessageV3.parseWithIOException(f8499d, inputStream);
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
            return m8403q().equals(textSource.m8403q()) && getUnknownFields().equals(textSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8499d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8500a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8500a.get(i11));
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
            if (m8402o() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8403q().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f8437r.ensureFieldAccessorsInitialized(TextSource.class, C6834b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8501b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8501b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public TextSource getDefaultInstanceForType() {
            return f8498c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TextSource();
        }

        /* renamed from: o */
        public int m8402o() {
            return this.f8500a.size();
        }

        /* renamed from: q */
        public List m8403q() {
            return this.f8500a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6834b newBuilderForType() {
            return m8399r();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C6834b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6834b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C6834b toBuilder() {
            return this == f8498c ? new C6834b() : new C6834b().m8456r(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f8500a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8500a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$b */
        public static final class C6834b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8512a;

            /* renamed from: b */
            public List f8513b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8514c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6834b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6834b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public TextSource build() {
                TextSource textSourceBuildPartial = buildPartial();
                if (textSourceBuildPartial.isInitialized()) {
                    return textSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) textSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public TextSource buildPartial() {
                TextSource textSource = new TextSource(this);
                m8446f(textSource);
                if (this.f8512a != 0) {
                    m8445e(textSource);
                }
                onBuilt();
                return textSource;
            }

            /* renamed from: e */
            public final void m8445e(TextSource textSource) {
            }

            /* renamed from: f */
            public final void m8446f(TextSource textSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8514c;
                if (repeatedFieldBuilderV3 != null) {
                    textSource.f8500a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8512a & 1) != 0) {
                    this.f8513b = Collections.unmodifiableList(this.f8513b);
                    this.f8512a &= -2;
                }
                textSource.f8500a = this.f8513b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6834b clear() {
                super.clear();
                this.f8512a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8514c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8513b = Collections.EMPTY_LIST;
                } else {
                    this.f8513b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8512a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f8436q;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6834b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6834b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6834b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6834b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8437r.ensureFieldAccessorsInitialized(TextSource.class, C6834b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6834b mo24228clone() {
                return (C6834b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m8451l() {
                if ((this.f8512a & 1) == 0) {
                    this.f8513b = new ArrayList(this.f8513b);
                    this.f8512a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TextSource getDefaultInstanceForType() {
                return TextSource.m8398k();
            }

            /* renamed from: n */
            public final RepeatedFieldBuilderV3 m8453n() {
                if (this.f8514c == null) {
                    this.f8514c = new RepeatedFieldBuilderV3(this.f8513b, (this.f8512a & 1) != 0, getParentForChildren(), isClean());
                    this.f8513b = null;
                }
                return this.f8514c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C6834b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TextInfo textInfo = (TextInfo) codedInputStream.readMessage(TextInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8514c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8451l();
                                        this.f8513b.add(textInfo);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6834b mergeFrom(Message message) {
                if (message instanceof TextSource) {
                    return m8456r((TextSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C6834b m8456r(TextSource textSource) {
                if (textSource == TextSource.m8398k()) {
                    return this;
                }
                if (this.f8514c == null) {
                    if (!textSource.f8500a.isEmpty()) {
                        if (this.f8513b.isEmpty()) {
                            this.f8513b = textSource.f8500a;
                            this.f8512a &= -2;
                        } else {
                            m8451l();
                            this.f8513b.addAll(textSource.f8500a);
                        }
                        onChanged();
                    }
                } else if (!textSource.f8500a.isEmpty()) {
                    if (this.f8514c.isEmpty()) {
                        this.f8514c.dispose();
                        this.f8514c = null;
                        this.f8513b = textSource.f8500a;
                        this.f8512a &= -2;
                        this.f8514c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8453n() : null;
                    } else {
                        this.f8514c.addAllMessages(textSource.f8500a);
                    }
                }
                mergeUnknownFields(textSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6834b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6834b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6834b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6834b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6834b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6834b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C6834b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6834b) super.setUnknownFields(unknownFieldSet);
            }

            public C6834b() {
                this.f8513b = Collections.EMPTY_LIST;
            }

            public C6834b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8513b = Collections.EMPTY_LIST;
            }
        }

        public TextSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8501b = (byte) -1;
        }

        private TextSource() {
            this.f8501b = (byte) -1;
            this.f8500a = Collections.EMPTY_LIST;
        }
    }

    public static final class TouchSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final TouchSource f8515c = new TouchSource();

        /* renamed from: d */
        public static final Parser f8516d = new C6837a();

        /* renamed from: a */
        public List f8517a;

        /* renamed from: b */
        public byte f8518b;

        public static final class TouchInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: e */
            public static final TouchInfo f8519e = new TouchInfo();

            /* renamed from: f */
            public static final Parser f8520f = new C6835a();

            /* renamed from: a */
            public int f8521a;

            /* renamed from: b */
            public List f8522b;

            /* renamed from: c */
            public EzyPaint.Paint f8523c;

            /* renamed from: d */
            public byte f8524d;

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$a */
            public class C6835a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TouchInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6836b c6836bM8480t = TouchInfo.m8480t();
                    try {
                        c6836bM8480t.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6836bM8480t.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6836bM8480t.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6836bM8480t.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6836bM8480t.buildPartial());
                    }
                }
            }

            /* renamed from: a */
            public static /* synthetic */ int m8473a(TouchInfo touchInfo, int i10) {
                int i11 = i10 | touchInfo.f8521a;
                touchInfo.f8521a = i11;
                return i11;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f8422c;
            }

            public static Parser parser() {
                return f8520f;
            }

            /* renamed from: q */
            public static TouchInfo m8479q() {
                return f8519e;
            }

            /* renamed from: t */
            public static C6836b m8480t() {
                return f8519e.toBuilder();
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
                if (getTouchEventList().equals(touchInfo.getTouchEventList()) && hasPaint() == touchInfo.hasPaint()) {
                    return (!hasPaint() || m8482s().equals(touchInfo.m8482s())) && getUnknownFields().equals(touchInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8520f;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = 0;
                for (int i11 = 0; i11 < this.f8522b.size(); i11++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8522b.get(i11));
                }
                if ((this.f8521a & 1) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m8482s());
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getTouchEventCount() {
                return this.f8522b.size();
            }

            public List getTouchEventList() {
                return this.f8522b;
            }

            public boolean hasPaint() {
                return (this.f8521a & 1) != 0;
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
                if (hasPaint()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m8482s().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8423d.ensureFieldAccessorsInitialized(TouchInfo.class, C6836b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8524d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8524d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TouchInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public TouchInfo getDefaultInstanceForType() {
                return f8519e;
            }

            /* renamed from: s */
            public EzyPaint.Paint m8482s() {
                EzyPaint.Paint paint = this.f8523c;
                return paint == null ? EzyPaint.Paint.m7967q() : paint;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6836b newBuilderForType() {
                return m8480t();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C6836b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6836b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C6836b toBuilder() {
                return this == f8519e ? new C6836b() : new C6836b().m8503t(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i10 = 0; i10 < this.f8522b.size(); i10++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f8522b.get(i10));
                }
                if ((this.f8521a & 1) != 0) {
                    codedOutputStream.writeMessage(2, m8482s());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$b */
            public static final class C6836b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8525a;

                /* renamed from: b */
                public List f8526b;

                /* renamed from: c */
                public RepeatedFieldBuilderV3 f8527c;

                /* renamed from: d */
                public EzyPaint.Paint f8528d;

                /* renamed from: e */
                public SingleFieldBuilderV3 f8529e;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getTouchEventFieldBuilder();
                        m8487q();
                    }
                }

                /* renamed from: q */
                private SingleFieldBuilderV3 m8487q() {
                    if (this.f8529e == null) {
                        this.f8529e = new SingleFieldBuilderV3(m8499n(), getParentForChildren(), isClean());
                        this.f8528d = null;
                    }
                    return this.f8529e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6836b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6836b) super.addRepeatedField(fieldDescriptor, obj);
                }

                /* renamed from: c */
                public C6836b m8489c(EzyTouchEvent.TouchEvent.C6845b c6845b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8527c;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c6845b.build());
                        return this;
                    }
                    ensureTouchEventIsMutable();
                    this.f8526b.add(c6845b.build());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public TouchInfo build() {
                    TouchInfo touchInfoBuildPartial = buildPartial();
                    if (touchInfoBuildPartial.isInitialized()) {
                        return touchInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public TouchInfo buildPartial() {
                    TouchInfo touchInfo = new TouchInfo(this);
                    m8493g(touchInfo);
                    if (this.f8525a != 0) {
                        m8492f(touchInfo);
                    }
                    onBuilt();
                    return touchInfo;
                }

                public final void ensureTouchEventIsMutable() {
                    if ((this.f8525a & 1) == 0) {
                        this.f8526b = new ArrayList(this.f8526b);
                        this.f8525a |= 1;
                    }
                }

                /* renamed from: f */
                public final void m8492f(TouchInfo touchInfo) {
                    int i10;
                    if ((this.f8525a & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8529e;
                        touchInfo.f8523c = singleFieldBuilderV3 == null ? this.f8528d : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    TouchInfo.m8473a(touchInfo, i10);
                }

                /* renamed from: g */
                public final void m8493g(TouchInfo touchInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8527c;
                    if (repeatedFieldBuilderV3 != null) {
                        touchInfo.f8522b = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f8525a & 1) != 0) {
                        this.f8526b = Collections.unmodifiableList(this.f8526b);
                        this.f8525a &= -2;
                    }
                    touchInfo.f8522b = this.f8526b;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f8422c;
                }

                public final RepeatedFieldBuilderV3 getTouchEventFieldBuilder() {
                    if (this.f8527c == null) {
                        this.f8527c = new RepeatedFieldBuilderV3(this.f8526b, (this.f8525a & 1) != 0, getParentForChildren(), isClean());
                        this.f8526b = null;
                    }
                    return this.f8527c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6836b clear() {
                    super.clear();
                    this.f8525a = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8527c;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f8526b = Collections.EMPTY_LIST;
                    } else {
                        this.f8526b = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f8525a &= -2;
                    this.f8528d = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8529e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f8529e = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6836b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6836b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f8423d.ensureFieldAccessorsInitialized(TouchInfo.class, C6836b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C6836b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6836b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6836b mo24228clone() {
                    return (C6836b) super.mo24228clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public TouchInfo getDefaultInstanceForType() {
                    return TouchInfo.m8479q();
                }

                /* renamed from: n */
                public EzyPaint.Paint m8499n() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8529e;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f8528d;
                    return paint == null ? EzyPaint.Paint.m7967q() : paint;
                }

                /* renamed from: p */
                public EzyPaint.Paint.C6804b m8500p() {
                    this.f8525a |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C6804b) m8487q().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C6836b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) codedInputStream.readMessage(EzyTouchEvent.TouchEvent.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8527c;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureTouchEventIsMutable();
                                            this.f8526b.add(touchEvent);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(touchEvent);
                                        }
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m8487q().getBuilder(), extensionRegistryLite);
                                        this.f8525a |= 2;
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
                public C6836b mergeFrom(Message message) {
                    if (message instanceof TouchInfo) {
                        return m8503t((TouchInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: t */
                public C6836b m8503t(TouchInfo touchInfo) {
                    if (touchInfo == TouchInfo.m8479q()) {
                        return this;
                    }
                    if (this.f8527c == null) {
                        if (!touchInfo.f8522b.isEmpty()) {
                            if (this.f8526b.isEmpty()) {
                                this.f8526b = touchInfo.f8522b;
                                this.f8525a &= -2;
                            } else {
                                ensureTouchEventIsMutable();
                                this.f8526b.addAll(touchInfo.f8522b);
                            }
                            onChanged();
                        }
                    } else if (!touchInfo.f8522b.isEmpty()) {
                        if (this.f8527c.isEmpty()) {
                            this.f8527c.dispose();
                            this.f8527c = null;
                            this.f8526b = touchInfo.f8522b;
                            this.f8525a &= -2;
                            this.f8527c = GeneratedMessageV3.alwaysUseFieldBuilders ? getTouchEventFieldBuilder() : null;
                        } else {
                            this.f8527c.addAllMessages(touchInfo.f8522b);
                        }
                    }
                    if (touchInfo.hasPaint()) {
                        m8504u(touchInfo.m8482s());
                    }
                    mergeUnknownFields(touchInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C6836b m8504u(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8529e;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f8525a & 2) == 0 || (paint2 = this.f8528d) == null || paint2 == EzyPaint.Paint.m7967q()) {
                        this.f8528d = paint;
                    } else {
                        m8500p().m7989n(paint);
                    }
                    if (this.f8528d != null) {
                        this.f8525a |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public final C6836b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6836b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C6836b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6836b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C6836b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6836b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public final C6836b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6836b) super.setUnknownFields(unknownFieldSet);
                }

                public C6836b() {
                    this.f8526b = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C6836b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8526b = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public TouchInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8524d = (byte) -1;
            }

            private TouchInfo() {
                this.f8524d = (byte) -1;
                this.f8522b = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$a */
        public class C6837a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6838b c6838bM8465r = TouchSource.m8465r();
                try {
                    c6838bM8465r.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6838bM8465r.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6838bM8465r.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6838bM8465r.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6838bM8465r.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f8420a;
        }

        /* renamed from: k */
        public static TouchSource m8464k() {
            return f8515c;
        }

        /* renamed from: r */
        public static C6838b m8465r() {
            return f8515c.toBuilder();
        }

        /* renamed from: u */
        public static TouchSource m8466u(InputStream inputStream) {
            return (TouchSource) GeneratedMessageV3.parseWithIOException(f8516d, inputStream);
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
            return m8469q().equals(touchSource.m8469q()) && getUnknownFields().equals(touchSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8516d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8517a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8517a.get(i11));
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
            if (m8468o() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8469q().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f8421b.ensureFieldAccessorsInitialized(TouchSource.class, C6838b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8518b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8518b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public TouchSource getDefaultInstanceForType() {
            return f8515c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchSource();
        }

        /* renamed from: o */
        public int m8468o() {
            return this.f8517a.size();
        }

        /* renamed from: q */
        public List m8469q() {
            return this.f8517a;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6838b newBuilderForType() {
            return m8465r();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C6838b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6838b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C6838b toBuilder() {
            return this == f8515c ? new C6838b() : new C6838b().m8524r(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f8517a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8517a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$b */
        public static final class C6838b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8530a;

            /* renamed from: b */
            public List f8531b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8532c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6838b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6838b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public TouchSource build() {
                TouchSource touchSourceBuildPartial = buildPartial();
                if (touchSourceBuildPartial.isInitialized()) {
                    return touchSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public TouchSource buildPartial() {
                TouchSource touchSource = new TouchSource(this);
                m8514f(touchSource);
                if (this.f8530a != 0) {
                    m8513e(touchSource);
                }
                onBuilt();
                return touchSource;
            }

            /* renamed from: e */
            public final void m8513e(TouchSource touchSource) {
            }

            /* renamed from: f */
            public final void m8514f(TouchSource touchSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8532c;
                if (repeatedFieldBuilderV3 != null) {
                    touchSource.f8517a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8530a & 1) != 0) {
                    this.f8531b = Collections.unmodifiableList(this.f8531b);
                    this.f8530a &= -2;
                }
                touchSource.f8517a = this.f8531b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6838b clear() {
                super.clear();
                this.f8530a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8532c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8531b = Collections.EMPTY_LIST;
                } else {
                    this.f8531b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8530a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f8420a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6838b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6838b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6838b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6838b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f8421b.ensureFieldAccessorsInitialized(TouchSource.class, C6838b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6838b mo24228clone() {
                return (C6838b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m8519l() {
                if ((this.f8530a & 1) == 0) {
                    this.f8531b = new ArrayList(this.f8531b);
                    this.f8530a |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TouchSource getDefaultInstanceForType() {
                return TouchSource.m8464k();
            }

            /* renamed from: n */
            public final RepeatedFieldBuilderV3 m8521n() {
                if (this.f8532c == null) {
                    this.f8532c = new RepeatedFieldBuilderV3(this.f8531b, (this.f8530a & 1) != 0, getParentForChildren(), isClean());
                    this.f8531b = null;
                }
                return this.f8532c;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C6838b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TouchInfo touchInfo = (TouchInfo) codedInputStream.readMessage(TouchInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8532c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8519l();
                                        this.f8531b.add(touchInfo);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6838b mergeFrom(Message message) {
                if (message instanceof TouchSource) {
                    return m8524r((TouchSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C6838b m8524r(TouchSource touchSource) {
                if (touchSource == TouchSource.m8464k()) {
                    return this;
                }
                if (this.f8532c == null) {
                    if (!touchSource.f8517a.isEmpty()) {
                        if (this.f8531b.isEmpty()) {
                            this.f8531b = touchSource.f8517a;
                            this.f8530a &= -2;
                        } else {
                            m8519l();
                            this.f8531b.addAll(touchSource.f8517a);
                        }
                        onChanged();
                    }
                } else if (!touchSource.f8517a.isEmpty()) {
                    if (this.f8532c.isEmpty()) {
                        this.f8532c.dispose();
                        this.f8532c = null;
                        this.f8531b = touchSource.f8517a;
                        this.f8530a &= -2;
                        this.f8532c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8521n() : null;
                    } else {
                        this.f8532c.addAllMessages(touchSource.f8517a);
                    }
                }
                mergeUnknownFields(touchSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6838b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6838b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6838b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6838b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6838b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6838b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C6838b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6838b) super.setUnknownFields(unknownFieldSet);
            }

            public C6838b() {
                this.f8531b = Collections.EMPTY_LIST;
            }

            public C6838b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8531b = Collections.EMPTY_LIST;
            }
        }

        public TouchSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8518b = (byte) -1;
        }

        private TouchSource() {
            this.f8518b = (byte) -1;
            this.f8517a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8197u().getMessageTypes().get(0);
        f8420a = descriptor;
        f8421b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"TouchInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f8422c = descriptor2;
        f8423d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TouchEvent", "Paint"});
        Descriptors.Descriptor descriptor3 = m8197u().getMessageTypes().get(1);
        f8424e = descriptor3;
        f8425f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MatrixInfo"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f8426g = descriptor4;
        f8427h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Matrix"});
        Descriptors.Descriptor descriptor5 = m8197u().getMessageTypes().get(2);
        f8428i = descriptor5;
        f8429j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"FileInfo"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        f8430k = descriptor6;
        f8431l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Name", "Width", "Height", "Validate"});
        Descriptors.Descriptor descriptor7 = m8197u().getMessageTypes().get(3);
        f8432m = descriptor7;
        f8433n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AudioInfo"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        f8434o = descriptor8;
        f8435p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Name", "Duration", "Validate"});
        Descriptors.Descriptor descriptor9 = m8197u().getMessageTypes().get(4);
        f8436q = descriptor9;
        f8437r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"TextInfo"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        f8438s = descriptor10;
        f8439t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Content", "Paint"});
        Descriptors.Descriptor descriptor11 = m8197u().getMessageTypes().get(5);
        f8440u = descriptor11;
        f8441v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"GeometryInfo"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        f8442w = descriptor12;
        f8443x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"GeometryType", "Points", "Paint"});
        EzyTouchEvent.m8535g();
        EzyMatrix.m7709c();
        EzyPaint.m7960c();
        EzyPointF.m8002c();
        EzyGeometryEnum.m7483a();
    }

    /* renamed from: u */
    public static Descriptors.FileDescriptor m8197u() {
        return f8444y;
    }
}
